# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Pinocchio bindings for dynamic-graph"
AUTHOR = "Guilhem Saurel <guilhem.saurel@laas.fr>"
ROS_AUTHOR = "Olivier Stasse"
HOMEPAGE = "http://stack-of-tasks.github.io"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "sot-dynamic-pinocchio"
ROS_BPN = "sot-dynamic-pinocchio"

ROS_BUILD_DEPENDS = " \
    doxygen \
    dynamic-graph-python \
    git \
    lapack \
    openblas \
    pinocchio \
    sot-core \
    sot-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-graph-python \
    lapack \
    openblas \
    pinocchio \
    sot-core \
    sot-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    dynamic-graph-python \
    lapack \
    openblas \
    pinocchio \
    sot-core \
    sot-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/stack-of-tasks/sot-dynamic-pinocchio-ros-release/archive/release/noetic/sot-dynamic-pinocchio/3.6.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/sot-dynamic-pinocchio"
SRC_URI = "git://github.com/stack-of-tasks/sot-dynamic-pinocchio-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "0c035cb14ef92c77eddba8ea4704d1cea91940bf"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
