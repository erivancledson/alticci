package labs.altice.alticci.service;

import org.springframework.stereotype.Service;

@Service
public class SequenciaService {

    public Long a(Long n) {

        if (n == 0) {
            return 0L;
        } else if (n == 1 || n == 2) {
            return 1L;
        }
        return a(n - 3) + a(n - 2);

    }
}
