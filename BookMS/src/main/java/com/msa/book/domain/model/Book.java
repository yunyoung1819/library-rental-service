package com.msa.book.domain.model;

import com.msa.book.domain.model.vo.BookDesc;
import com.msa.book.domain.model.vo.BookStatus;
import com.msa.book.domain.model.vo.Classification;
import com.msa.book.domain.model.vo.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private long no;
    private String title;
    private BookDesc desc;
    private Classification classification;
    private BookStatus bookStatus;
    private Location location;
}
