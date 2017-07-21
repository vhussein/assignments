package com.azlan.assignments.question1;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
//@Getter
//@Setter
//@NoArgsConstructor
public class IPAddressDTO implements Serializable{
    private List<String> validIP;
    private List<String> invalidIP;

}
