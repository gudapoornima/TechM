package com.app.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "positions")
public class Position {
	    @Id
	    private String id;

	    @NotBlank
	    @Size(max = 140)
	    private String positionName;

	    private String description;

	    @NotNull
	    private Date createdAt = new Date();
	
	
	

}
