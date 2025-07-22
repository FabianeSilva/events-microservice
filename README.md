# Micro-Serviço de Eventos
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37.svg?style=for-the-badge&logo=Postman&logoColor=white)

Este projeto é uma API (Interface de Programação de Aplicações) de simulação de sistema de inscrição em eventos, utilizando JAVA e Spring Boot, conforme elaborado na live da Fernanda Kipper, Desenvolvedora Java do Mercado Livre, para obter maior conhecimento na linguagem.

## Responsabilidades da API (Interface de Programação de Aplicações)
- Retornar uma lista de todos os eventos, filtrando por data, retornando apenas aqueles que ainda não foram realizados;
- Cadastrar novos eventos no banco de dados
- Receber as requisições de novas inscrições em um evento, salvando cada inscrição no banco de dados.

## Ferramenta utilizada para realização de testes
Para verificar se o código estava funcionando corretamente foi utilizada a Ferramenta POSTMAN, apresentando a mensagem abaixo relacionada no Body do cadastro:

{
    
    "id": "5a1cde6e-675d-4e65-b73b-6644f32f753c",
    "maxParticipants": 9,
    "registeredParticipants": 0,
    "date": "10/05/2025",
    "title": "Frontim Floripa",
    "description": "Evento Touchem Florianopolis"
}











