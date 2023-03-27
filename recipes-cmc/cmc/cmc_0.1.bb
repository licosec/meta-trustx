Description = "The Connector Measurement Component (CMC) repository provides tools and software to enable remote attestation of computing platforms in the International Data Spaces (IDS). "

GO_IMPORT = "github.com/Fraunhofer-AISEC/cmc"

inherit go

SRCREV = "${AUTOREV}"
SRC_URI = "git://${GO_IMPORT};protocol=https;branch=main;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"

#DEPENDS = "go"

#TODO: Set license to Apache. Currently this breaks the build
LICENSE = "CLOSED"
#LICENSE = "Apache-2.0"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=b1e01b26bacfc2232046c90a330332b3"

do_compile () {
    cd src/github.com/Fraunhofer-AISEC/cmc/cmcd
    ${GO} build
}