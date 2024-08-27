package io.github.joaovmundel.testedemocrata.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/fatorial")
public class FatorialController {

    @GetMapping("/{numero}")
    public ResponseEntity<String> calculoFatorial(@PathVariable Integer numero) {
        return ResponseEntity.ok(calcularFatorial(numero));
    }

    public String calcularFatorial(int numero) {
        BigInteger fatorial = BigInteger.ONE;
        StringBuilder passoAPasso = new StringBuilder();

        for (int i = numero; i > 0; i--) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
            passoAPasso.append(i);
            if (i > 1) {
                passoAPasso.append(" x ");
            }
        }

        return passoAPasso.append(" = ").append(fatorial).toString();
    }
}
