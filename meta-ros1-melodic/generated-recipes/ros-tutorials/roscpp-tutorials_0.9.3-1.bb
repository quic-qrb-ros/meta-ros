# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package attempts to show the features of ROS step-by-step,     including using messages, servers, parameters, etc."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Morgan Quigley"
HOMEPAGE = "http://www.ros.org/wiki/roscpp_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_tutorials"
ROS_BPN = "roscpp_tutorials"

ROS_BUILD_DEPENDS = " \
    boost \
    message-generation \
    rosconsole \
    roscpp \
    roscpp-serialization \
    rostime \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    message-runtime \
    rosconsole \
    roscpp \
    roscpp-serialization \
    rostime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    message-runtime \
    rosconsole \
    roscpp \
    roscpp-serialization \
    rostime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_tutorials-release/archive/release/melodic/roscpp_tutorials/0.9.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/roscpp_tutorials"
SRC_URI = "git://github.com/ros-gbp/ros_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "7fd4c3624e205c8804a8a721edcac667d83457de"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
