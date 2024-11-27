package com.example.acmethicsapp.data

import com.example.acmethicsapp.model.Section

object Chapter4Repository {
    val sections = listOf(
        Section(
            id = "chapter4.1",
            title = "4.1 Uphold, promote, and respect the principles of the Code",
            description = """
                Computing professionals should prioritize both technical and ethical excellence to ensure the future of computing. This includes:
                - Adhering to the principles of the Code.
                - Contributing to the improvement of these principles.
                - Addressing recognized breaches of the Code by expressing concerns to those involved and seeking resolutions.
            """.trimIndent()
        ),
        Section(
            id = "chapter4.2",
            title = "4.2 Treat violations of the Code as inconsistent with membership in the ACM",
            description = """
                ACM members should:
                - Encourage adherence to the Code by all computing professionals, regardless of ACM membership.
                - Report recognized breaches to the ACM, which may result in remedial action as outlined in the ACM's Code of Ethics and Professional Conduct Enforcement Policy.
            """.trimIndent()
        )
    )
}
