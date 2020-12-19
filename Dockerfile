FROM groovy:jdk11

USER root
ARG USERID
RUN usermod --uid $USERID groovy && \
    groupmod --gid $USERID groovy &&  \ 
    find / -gid 1000 -exec chgrp -R $USERID \{\}  \; ; \
    find / -uid 1000 -exec chown -R $USERID \{\}  \; || true
RUN apt-get update && \
    apt-get install -y vim zip

USER groovy

RUN curl -s "https://get.sdkman.io" | bash
RUN ["/usr/bin/bash", "-c", "source \"$HOME/.sdkman/bin/sdkman-init.sh\" &&  sdk install gradle"]

WORKDIR /home/groovy/scripts
VOLUME /home/exercism/scripts
