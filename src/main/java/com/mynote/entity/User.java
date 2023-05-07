package com.mynote.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	@Id
	private int id;

	private Boolean enabled;

	private String emailAddress;

	private String name;

	private String password;

	private String createdBy;

	private Date createdDate;

	private String lastModifiedBy;

	private Date lastModifiedDate;

}
