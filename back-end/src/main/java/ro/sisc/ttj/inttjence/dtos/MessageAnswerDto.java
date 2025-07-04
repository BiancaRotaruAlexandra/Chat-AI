package ro.sisc.ttj.inttjence.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageAnswerDto {
    private List<ModelAnswerChoiceDto> choices;
}
