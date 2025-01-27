package com.msa.rental.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Item {
    private Integer no;
    private String title;

    public static Item sample() {
        return new Item(10, "소년이 온다");
    }
}
