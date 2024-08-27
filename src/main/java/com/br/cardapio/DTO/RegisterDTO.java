package com.br.cardapio.DTO;

import com.br.cardapio.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role){
    
}
