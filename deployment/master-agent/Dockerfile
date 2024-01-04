# syntax=docker/dockerfile:1

FROM jenkins/inbound-agent:3198.v03a_401881f3e-1

USER root

# hadolint ignore=DL3008
RUN apt-get update \
    && apt-get install -y --no-install-recommends sshpass \
    && apt-get install -y --no-install-recommends ansible \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

USER jenkins
