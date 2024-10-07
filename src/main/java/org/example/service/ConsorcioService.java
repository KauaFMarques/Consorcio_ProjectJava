package org.example.service;

import org.example.model.Cliente;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConsorcioService {

    public Map<String, Object> calcularConsorcio(Cliente cliente) {
        double taxaAdministracao = 0.15;
        double taxaAdministracaoValor = cliente.getValorCarro() * taxaAdministracao;

        double valorTotal = cliente.getValorCarro() + taxaAdministracaoValor;
        double parcelasMensais = valorTotal / cliente.getPrazo();

        double disponibilidadeMensal = cliente.getRendaMensal() - cliente.getCompromissosFinanceiros();
        boolean aprovado = disponibilidadeMensal >= parcelasMensais;

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("cliente", cliente.getNome());
        resultado.put("valor_consorcio", cliente.getValorCarro());
        resultado.put("taxa_administracao", taxaAdministracaoValor);
        resultado.put("prazo", cliente.getPrazo());
        resultado.put("parcelas_mensais", parcelasMensais);
        resultado.put("total_a_ser_pago", valorTotal);
        resultado.put("historico_credito", aprovado ? "Aprovado" : "Rejeitado");
        resultado.put("entrada", 0);
        resultado.put("disponibilidade_mensal", disponibilidadeMensal);

        return resultado;
    }
}
