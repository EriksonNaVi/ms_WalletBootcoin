package com.bootcamp.yankiwallet.events;

import com.bootcamp.yankiwallet.model.OwnerWallet;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class OwnerWalletCreateEvent  extends Event<OwnerWallet>{

}
