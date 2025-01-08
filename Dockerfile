FROM gradle:8.12-jdk8
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src

ENTRYPOINT ["gradle", "test", "--no-daemon"]
