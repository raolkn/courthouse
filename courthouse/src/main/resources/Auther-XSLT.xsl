<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">

<MyList>
    <xsl:for-each select="catalog/cd">
    <Book>
		<Title><xsl:value-of select="title"/></Title>
		<Artist><xsl:value-of select="artist"/></Artist>
    </Book>
    </xsl:for-each>
</MyList>
</xsl:template>
</xsl:stylesheet>

