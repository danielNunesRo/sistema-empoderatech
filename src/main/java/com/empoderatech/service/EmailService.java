package com.empoderatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.empoderatech.config.EmailConfig;

@Service
public class EmailService {
	
	@Autowired
    private JavaMailSender emailSender;
	
	String mensagem = "Olá,\n" +
            "Agradecemos por se inscrever no Programa de Incentivo e Capacitação para Mulheres no Mercado Tecnológico do EmpoderaTech!\n" +
            "Queremos destacar nossa preocupação e motivação para promover a participação das mulheres no mercado de trabalho, especialmente no setor de tecnologia. Reconhecemos a importância da diversidade e buscamos criar oportunidades inclusivas.\n" +
            "Estamos analisando cuidadosamente sua inscrição e desejamos a você toda a sorte neste processo seletivo. Em breve, entraremos em contato para fornecer mais informações sobre o andamento do processo.\n" +
            "Obrigado por fazer parte do EmpoderaTech e por contribuir para a construção de um ambiente mais diversificado e inclusivo no campo tecnológico.\n" +
            "Atenciosamente,\n" +
            "Equipe EmpoderaTech.";

	public void sendSimpleMessage(String to) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@empoderatech.com"); 
        message.setTo(to);
        message.setSubject("Bem vindo ao processo seletivo da Empodera Tech");
        message.setText(mensagem);
        emailSender.send(message);
    }
	
}
