USERID := $(shell id -u)

build:
	DOCKER_BUILDKIT=1 docker build -f Dockerfile -t groovy:latest --build-arg USERID=${USERID} .

run_bash:
	docker run --name groovy --rm -ti -v "$(CURDIR)":/home/groovy/scripts -v "$(CURDIR)"/.grapes:/home/groovy/.groovy/grape -v "$(CURDIR)"/.gradle:/home/groovy/.gradle  groovy:latest bash
run_bash_as_root:
	docker run --name groovy --rm -ti -v "$(CURDIR)":/home/groovy/scripts -u root  groovy:latest bash
test:
