package br.com.fatecservicemain.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table(name = "tb_user")
public class User implements Serializable {
	
	
    private static final long serialVersionUID = 926371019544046681L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "name")
    @NotNull(message = "O campo nome deve ser informado!")
    private String name;

    @Column(name = "idade")
    @NotNull(message = "O campo idade deve ser informado!")
    private Integer age;

    public static User mapper(Object object) {
	var result = User.builder().build();
	BeanUtils.copyProperties(object, result);
	return result;
    }

}
