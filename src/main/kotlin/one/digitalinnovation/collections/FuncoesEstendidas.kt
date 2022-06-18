package one.digitalinnovation.collections

import java.math.BigDecimal

// funcoes estendidas nos dao a possibilidade de criar funcoes diversas sobre um tipo especificp
// sem precisar herdar

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()