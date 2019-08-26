# Exemplo utilizando Kafka

 Exemplo de Producer e Consumer de mensagens usando Spring Boot integrado ao Kafka.

#### Nota: O Apache Kafka fornece a infraestrutura de message broker ou fila de mensagens capaz de armazenar, processar e distribuir trilhões de eventos/dia.

Requisitos:

    Maven    
    Java JDK 8
    Kafka 2.12-2.3.0

Subir o serviço Kafka:
    
    1) Baixar o Kafka no endereço: https://kafka.apache.org/downloads e descompactar no Sistema Operacional
    2) Entrar pelo terminal na raiz do Kafka descompactado e iniciar os serviços em terminais distintos com os comandos:

    terminal 1: bin/zookeeper-server-start.sh config/zookeeper.properties
    terminal 2: bin/kafka-server-start.sh config/server.properties

#### Nota: O Apache Zookeeper é um serviço centralizado para manter informações de configurações e nomenclaturas entre serviços distribuídos. O Kafka utiliza o Zookeeper para sincronizar as configurações entre diferentes clusters.

Criar o tópico de mensagem 'myTopic' com o comando:
        
    terminal 3: bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic myTopic

---

Subir projeto Spring-boot com Producer e Consumer para o tópico criado "myTopic". Na raiz do projeto kafkaexemplo:

    mvn spring-boot:run

Teste:

Enviar mensagem para o serviço:    

    curl -X POST http://localhost:8080/api/kafka -H "Content-Type: application/json" -d '{"titulo":"Titulo 1", "descricao":"Descricao 1"}'