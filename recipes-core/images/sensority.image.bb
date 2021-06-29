DESCRIPTION = "A console-only sensority image."
LICENSE = "MIT"

IMAGE_FEATURES += "\
    splash \
    ssh-server-openssh \
"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
"

inherit core-image
