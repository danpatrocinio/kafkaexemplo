# kafkaexemplo

 Exemplo de Producer e Consumer de mensagens usando Kafka e Spring Boot

Requisitos:
    
    Baixar o Kafka no endereço: https://kafka.apache.org/downloads

Subir o serviço Kafka:
    
    1) Descompactar o Kafka no Sistema Operacional
    2) Entrar pelo terminal na raiz do Kafka descompactado e iniciar os serviços com os comandos:

    terminal 1: bin/kafka-server-start.sh config/server.properties
    terminal 2: bin/zookeeper-server-start.sh config/zookeeper.properties

Criar o tópico de mensagem 'myTopic' com o comando:
        
    terminal 3: bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic myTopic