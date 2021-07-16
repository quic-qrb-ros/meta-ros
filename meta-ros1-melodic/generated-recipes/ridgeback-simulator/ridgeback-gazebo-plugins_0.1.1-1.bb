# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A fork of hector_gazebo_plugins to provide the ros_force_based_move plugin."
AUTHOR = "Johannes Meyer <meyer@fsr.tu-darmstadt.de>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ridgeback_simulator"
ROS_BPN = "ridgeback_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libgazebo9-dev} \
    geometry-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    gazebo-ros \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    roscpp \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    gazebo-ros \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    roscpp \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/ridgeback_simulator-release/archive/release/melodic/ridgeback_gazebo_plugins/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ridgeback_gazebo_plugins"
SRC_URI = "git://github.com/clearpath-gbp/ridgeback_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "76c6fa62a465158ad7bcf7176286ce0e0a2e33bc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
