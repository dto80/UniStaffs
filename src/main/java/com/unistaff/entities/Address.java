package com.unistaff.entities;

import com.unistaff.entities.address.District;
import com.unistaff.entities.address.Province;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Address {

    private String homeNumber;

    private String soi;

    private String road;

    private String tumbon;

    @ManyToOne
    private District district;

    @ManyToOne
    private Province province;
}
