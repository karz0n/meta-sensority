# Include complete list of tools to work with filesystem
CORE_IMAGE_EXTRA_INSTALL_append = "\
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"

CORE_IMAGE_EXTRA_INSTALL_append = "\
    poco-dev \
    mosquitto-dev \
"