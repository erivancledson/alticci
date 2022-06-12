package labs.altice.alticci.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

@Getter
@Setter
public class SequenciaDTO {

    @Min(message = "O valor de N deve ser maior ou igual a zero.", value = 0)
    private Long n;
}
