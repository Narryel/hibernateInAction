
start:
	docker-compose -f ./docker/docker-compose.yml up -d

stop:
	docker-compose -f ./docker/docker-compose.yml down

restart: stop start

swagger:
	open http://localhost:8080/swagger-ui.html

