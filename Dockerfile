FROM dvmarques/openjdk-17-jdk-alpine-with-timezone

WORKDIR /app

COPY . .

RUN javac Sum.javac

CMD ["java","Sum"]