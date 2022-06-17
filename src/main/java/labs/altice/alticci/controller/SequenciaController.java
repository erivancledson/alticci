package labs.altice.alticci.controller;

import labs.altice.alticci.dto.SequenciaDTO;
import labs.altice.alticci.service.SequenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/alticci")
@CrossOrigin(origins = "*")
public class SequenciaController {

    @Autowired
    private SequenciaService sequenciaService;

    @GetMapping("/{n}")
    public Long a(@Valid SequenciaDTO sequenciaDTO) {
        return sequenciaService.a(sequenciaDTO.getN());
    }

}
