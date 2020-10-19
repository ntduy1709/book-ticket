package com.ifi.bookticket.service;

import com.ifi.bookticket.dto.UserDTO;
import com.ifi.bookticket.model.EnumTicket;
import com.ifi.bookticket.model.User;
import com.ifi.bookticket.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    public List<UserDTO> getUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : userList) {
            UserDTO userDTO = mapper.map(user, UserDTO.class);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    public UserDTO postUser(UserDTO userDTO) {
        String date = userDTO.getDoB();
        Date convertDate = Date.valueOf(date);
        User user = mapper.map(userDTO, User.class);
        user.setDoB(convertDate);
        if (userDTO.getTypeOfClass() == "Ticket3D") {
            user.setTypeOfClass(EnumTicket.TICKET3D);
        } else {
            user.setTypeOfClass(EnumTicket.TICKET2D);
        }
        User userSaved = userRepository.save(user);
        return mapper.map(userSaved, UserDTO.class);
    }
}
