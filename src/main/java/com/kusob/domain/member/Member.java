package com.kusob.domain.member;

import lombok.*;

/**
 * Created by kusob on 2017. 7. 4..
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
    private int member_id;
    private String email;
    private String password;
    private String name;
}
