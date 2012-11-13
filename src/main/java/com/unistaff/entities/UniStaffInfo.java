package com.unistaff.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class UniStaffInfo {

    @NotNull
    private String name;

    @NotNull
    private String familyName;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "dd-MM-yyyy")
    private Date birthDate;
}
