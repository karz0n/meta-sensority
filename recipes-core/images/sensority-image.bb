SUMMARY = "Sensority console-only production image"
LICENSE = "MIT"

IMAGE_FEATURES = "\
    splash \
"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "\
    libgcc \
    libatomic \
    libstdc++ \
"

require common.inc
