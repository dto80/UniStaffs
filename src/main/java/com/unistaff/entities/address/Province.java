package com.unistaff.entities.address;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Province {

    @NotNull
    String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<District> districts = new HashSet<District>();
}
