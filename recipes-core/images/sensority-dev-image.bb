SUMMARY = "Sensority console-only development image"
LICENSE = "MIT"

IMAGE_FEATURES = "\
    splash \
    ssh-server-openssh \
    debug-tweaks \
"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-core-full-cmdline \
    packagegroup-self-hosted \
    packagegroup-custom-devtools \
"

CORE_IMAGE_EXTRA_INSTALL += "\
    googletest-dev \
    googletest-dbg \
    poco-dev \
    poco-dbg \
    mosquitto-dev \
    mosquitto-dbg \
    boost-dev \
    boost-dbg \
    grpc-dev \
    grpc-dbg \
"

require common.inc
