// write the classes here
class OperatingSystem {
    var name: String = "Unknow"
}
class DualBoot {
    var os = OperatingSystem()
    os.name: String = "Windows"
    var primaryOs: String = os.name
    os.name: String = "Ubuntu"
    var secondaryOs: String = os.name
}
