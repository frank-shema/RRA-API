package com.example.services;

import com.example.dto.requests.LoginDTO;
import com.example.dto.responses.ApiResponse;

public interface IAuthService {
    ApiResponse login(LoginDTO dto);
    ApiResponse register();
}
