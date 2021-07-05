SUMMARY = "Sensority console-only development image"
LICENSE = "MIT"

IMAGE_FEATURES = "\
    splash \
    ssh-server-openssh \
    debug-tweaks \
"

inherit core-image

# Defines main package groups
CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-core-full-cmdline \
    packagegroup-self-hosted \
"

# Defines additional packages
CORE_IMAGE_EXTRA_INSTALL += "\
    googletest \
"

require common.inc
