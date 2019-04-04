FROM 100.125.7.36:20202/op_svc_servicestage/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/jszlb-0.0.1-SNAPSHOT.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]