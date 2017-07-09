package com.kusob.domain.wallet;

import lombok.*;

/**
 * Created by kusob on 2017. 7. 8..
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletAddDTO {
    String email;
    String walletName;
    String walletSite;
    String walletAddr;
}
