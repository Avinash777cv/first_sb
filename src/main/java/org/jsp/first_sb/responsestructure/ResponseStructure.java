package org.jsp.first_sb.responsestructure;

import java.util.List;

import org.jsp.pms.entity.Person;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class ResponseStructure <T>{

	private int status;		//httpStatus
	private String message;
	private T body;

}
