package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String name;          // անուն
    private String surname;       // ազգանուն
    private String userEmail;         // էլ. հասցե
    private String password;       // գախնաբառ
    private UserType type;


}
