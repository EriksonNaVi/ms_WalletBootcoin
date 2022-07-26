package com.bootcamp.yankiwallet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerWallet {
	
	
	  private String idOwnerWallet;
	  private String names;
	  private String surName;
	  private String secondSurName;
	  private String documentNumber;
	  private String documentType;
	  private String phoneNumber;
	  private String email;

}
