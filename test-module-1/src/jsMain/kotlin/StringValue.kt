actual class StringValue(val value: String)

actual fun StringValue.plus(other: String) = StringValue(this.value + other)
