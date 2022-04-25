package com.vti.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class JwtResponseDTO {
	@NonNull
	private String jwtToken;
	
	@NonNull
	private String username;
	
	@NonNull
	private String role;
}
