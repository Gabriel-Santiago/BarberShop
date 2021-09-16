package Servico;

import Model.Agendamento;

public class Correio {
    
    public void notificarPorEmail(Agendamento agendamento){
        
        String emailFormatado = formarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
        email.enviar();
    }

    private String formarEmail(Agendamento agendamento) {
        
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá " + nomeCliente + 
                " Vai dar um tapa no visu... Seu agendamento " + servico +
                ", está marcado para " + dataAgendamento +
                " as " + horaAgendamento +
                " o valor será R$" + valor +
                "\nNos vemos lá :)";
    }  
}
