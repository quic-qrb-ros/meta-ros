# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Configuration and launch files for running ROS navigation on Fetch."
AUTHOR = "Niharika Arora <narora@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://docs.fetchrobotics.com/navigation.html"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_ros"
ROS_BPN = "fetch_navigation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    base-local-planner \
    clear-costmap-recovery \
    costmap-2d \
    fetch-depth-layer \
    fetch-maps \
    map-server \
    move-base \
    move-base-msgs \
    navfn \
    rotate-recovery \
    slam-karto \
    voxel-grid \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_navigation/0.8.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fetch_navigation"
SRC_URI = "git://github.com/fetchrobotics-gbp/fetch_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "29034bde9693b93936445f0b1fdc2966373daa8d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
