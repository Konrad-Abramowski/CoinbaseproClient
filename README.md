# Coinbase Pro Client
Spring 5 Web application forwarding Bitcoin and Ethereum data to client under http://localhost:8080 (data available with GET HTTP request).


## Getting Started (Ubuntu) <a name = "getting_started"></a>

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.


### Prerequisites

<br/>`docker with docker-compose` https://docs.docker.com/get-docker/
<br/> or
<br/>`java 11` https://www.oracle.com/pl/java/technologies/javase-downloads.html

### Installing with Java

Execute the following commands:
```
$ cd <place-you-want-to-store-coinbaseproclient>
$ it clone https://github.com/Konrad-Abramowski/CoinbaseproClient.git
$ cd CoinbaseproClient
$ ./mvnw spring-boot:run
```

CoinbaseproClient will be running under the address:
```
http://localhost:8080
```

If you want to close the application, use hotkey: CTRL + C



### Installing with Docker

Execute the following commands:
```
$ cd <place-you-want-to-store-coinbaseproclient>
$ it clone https://github.com/Konrad-Abramowski/CoinbaseproClient.git
$ cd CoinbaseproClient
$ sudo docker-compose up -d
```



CoinbaseproClient will be running under the address:
```
http://localhost:8080
```

If you want to close the application, use:
```
$ sudo docker-compose down
```

